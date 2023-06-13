SUMMARY = "Determine the locale encoding"
DESCRIPTION = "In many applications it's wise to let Perl use Unicode for the strings it \
processes. Most of the interfaces Perl has to the outside world are still \
byte based. Programs therefore need to decode byte strings that enter the \
program from the outside and encode them again on the way out. \
 \
The POSIX locale system is used to specify both the language conventions \
requested by the user and the preferred character set to consume and \
output. The 'Encode::Locale' module looks up the charset and encoding \
(called a CODESET in the locale jargon) and arranges for the the Encode \
manpage module to know this encoding under the name 'locale'. It means \
bytes obtained from the environment can be converted to Unicode strings by \
calling 'Encode::encode(locale => $bytes)' and converted back again with \
'Encode::decode(locale => $string)'. \
 \
Where file systems interfaces pass file names in and out of the program we \
also need care. The trend is for operating systems to use a fixed file \
encoding that don't actually depend on the locale; and this module \
determines the most appropriate encoding for file names. The the Encode \
manpage module will know this encoding under the name 'locale_fs'. For \
traditional Unix systems this will be an alias to the same encoding as \
'locale'. \
 \
For programs running in a terminal window (called a 'Console' on some \
systems) the 'locale' encoding is usually a good choice for what to expect \
as input and output. Some systems allows us to query the encoding set for \
the terminal and 'Encode::Locale' will do that if available and make these \
encodings known under the 'Encode' aliases 'console_in' and 'console_out'. \
For systems where we can't determine the terminal encoding these will be \
aliased as the same encoding as 'locale'. The advice is to use 'console_in' \
for input known to come from the terminal and 'console_out' for output to \
the terminal. \
 \
In addition to arranging for various Encode aliases the following functions \
and variables are provided: \
 \
* decode_argv( ) \
 \
* decode_argv( Encode::FB_CROAK ) \
 \
  This will decode the command line arguments to perl (the '@ARGV' array) \
  in-place. \
 \
  The function will by default replace characters that can't be decoded by \
  '\\x{FFFD}', the Unicode replacement character. \
 \
  Any argument provided is passed as CHECK to underlying Encode::decode() \
  call. Pass the value 'Encode::FB_CROAK' to have the decoding croak if not \
  all the command line arguments can be decoded. See the Encode/'Handling \
  Malformed Data' manpage for details on other options for CHECK. \
 \
* env( $uni_key ) \
 \
* env( $uni_key => $uni_value ) \
 \
  Interface to get/set environment variables. Returns the current value as \
  a Unicode string. The $uni_key and $uni_value arguments are expected to \
  be Unicode strings as well. Passing 'undef' as $uni_value deletes the \
  environment variable named $uni_key. \
 \
  The returned value will have the characters that can't be decoded \
  replaced by '\\x{FFFD}', the Unicode replacement character. \
 \
  There is no interface to request alternative CHECK behavior as for \
  decode_argv(). If you need that you need to call encode/decode yourself. \
  For example: \
 \
      my $key = Encode::encode(locale => $uni_key, Encode::FB_CROAK); \
      my $uni_value = Encode::decode(locale => $ENV{$key}, Encode::FB_CROAK); \
 \
* reinit( ) \
 \
* reinit( $encoding ) \
 \
  Reinitialize the encodings from the locale. You want to call this \
  function if you changed anything in the environment that might influence \
  the locale. \
 \
  This function will croak if the determined encoding isn't recognized by \
  the Encode module. \
 \
  With argument force $ENCODING_... variables to set to the given value. \
 \
* $ENCODING_LOCALE \
 \
  The encoding name determined to be suitable for the current locale. the \
  Encode manpage know this encoding as 'locale'. \
 \
* $ENCODING_LOCALE_FS \
 \
  The encoding name determined to be suitable for file system interfaces \
  involving file names. the Encode manpage know this encoding as \
  'locale_fs'. \
 \
* $ENCODING_CONSOLE_IN \
 \
* $ENCODING_CONSOLE_OUT \
 \
  The encodings to be used for reading and writing output to the a console. \
  the Encode manpage know these encodings as 'console_in' and \
  'console_out'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-Encode-Locale-1.05-1.26.noarch.rpm"
RPM_HASH = "f09d12dd240e3ec4db6266058cdc6587bccb27caa0e07a5a68ad6cd9921667566e98195a7a24fcb454f30f677e9d2bae9170279df13fc94561a3d1cf998eec7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Encode::Locale) \
perl-Encode-Locale"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
