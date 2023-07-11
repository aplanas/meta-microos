SUMMARY = "Perl extension for International Standard Serial Numbers"
DESCRIPTION = "* new($issn) \
 \
The constructor accepts a scalar representing the ISSN. \
 \
The string representing the ISSN may contain characters other than [0-9xX], \
although these will be removed in the internal representation. The \
resulting string must look like an ISSN - the first seven characters must \
be digits and the eighth character must be a digit, 'x', or 'X'. \
 \
The string passed as the ISSN need not be a valid ISSN as long as it \
superficially looks like one. This allows one to use the 'fix_checksum' \
method. \
 \
One should check the validity of the ISSN with 'is_valid()' rather than \
relying on the return value of the constructor. \
 \
If all one wants to do is check the validity of an ISSN, one can skip the \
object-oriented interface and use the c<is_valid_checksum()> function which \
is exportable on demand. \
 \
If the constructor decides it can't create an object, it returns undef. It \
may do this if the string passed as the ISSN can't be munged to the \
internal format. \
 \
* $obj->checksum \
 \
Return the ISSN checksum. \
 \
* $obj->as_string \
 \
Return the ISSN as a string. \
 \
A terminating 'x' is changed to 'X'. \
 \
* $obj->is_valid \
 \
Returns 1 if the checksum is valid. \
 \
Returns 0 if the ISSN does not pass the checksum test. The constructor \
accepts invalid ISSN's so that they might be fixed with 'fix_checksum'. \
 \
* $obj->fix_checksum \
 \
Replace the eighth character with the checksum the corresponds to the \
previous seven digits. This does not guarantee that the ISSN corresponds to \
the product one thinks it does, or that the ISSN corresponds to any product \
at all. It only produces a string that passes the checksum routine. If the \
ISSN passed to the constructor was invalid, the error might have been in \
any of the other nine positions."
LICENSE = "Artistic-2.0"

PV = "1.005"

RPM_NAME = "perl-Business-ISSN-1.005-1.8.noarch.rpm"
RPM_HASH = "f08e710aa762140f283e5b03a095d8e7969a851876958fc2d1ba97a5e0e9c69ace671ab8a9926112bbac33fe2378bf164ea16f2117a743b8ffc0cc428b2e3fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISSN \
perl-Business-ISSN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
