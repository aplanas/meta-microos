SUMMARY = "Character encodings in Perl"
DESCRIPTION = "The 'Encode' module provides the interface between Perl strings and the \
rest of the system. Perl strings are sequences of _characters_. \
 \
The repertoire of characters that Perl can represent is a superset of those \
defined by the Unicode Consortium. On most platforms the ordinal values of \
a character as returned by 'ord(_S_)' is the _Unicode codepoint_ for that \
character. The exceptions are platforms where the legacy encoding is some \
variant of EBCDIC rather than a superset of ASCII; see perlebcdic. \
 \
During recent history, data is moved around a computer in 8-bit chunks, \
often called 'bytes' but also known as 'octets' in standards documents. \
Perl is widely used to manipulate data of many types: not only strings of \
characters representing human or computer languages, but also 'binary' \
data, being the machine's representation of numbers, pixels in an image, or \
just about anything. \
 \
When Perl is processing 'binary data', the programmer wants Perl to process \
'sequences of bytes'. This is not a problem for Perl: because a byte has \
256 possible values, it easily fits in Perl's much larger 'logical \
character'. \
 \
This document mostly explains the _how_. perlunitut and perlunifaq explain \
the _why_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.19"

RPM_NAME = "perl-Encode-3.19-1.4.aarch64.rpm"
RPM_HASH = "e0321b3161c6646e5f0d3b83f5221f75ba88758ad0a333830695613e9526d1afd36106622c141e570fc2ae36e2b76a8e99144585cfbc92d4db5e0a15fc77fda1"

RPROVIDES:${PN} += "perl-Encode \
perl-Encode--Alias \
perl-Encode--Byte \
perl-Encode--CJKConstants \
perl-Encode--CN \
perl-Encode--CN--HZ \
perl-Encode--Config \
perl-Encode--EBCDIC \
perl-Encode--Encoder \
perl-Encode--Encoding \
perl-Encode--GSM0338 \
perl-Encode--Guess \
perl-Encode--JP \
perl-Encode--JP--H2Z \
perl-Encode--JP--JIS7 \
perl-Encode--KR \
perl-Encode--KR--2022-KR \
perl-Encode--MIME--Header \
perl-Encode--MIME--Header--ISO-2022-JP \
perl-Encode--MIME--Name \
perl-Encode--Symbol \
perl-Encode--TW \
perl-Encode--UTF-EBCDIC \
perl-Encode--Unicode \
perl-Encode--Unicode--UTF7 \
perl-Encode--XS \
perl-Encode--utf8 \
perl-encoding"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
