SUMMARY = "Provide interoperable MD5-based crypt() functions"
DESCRIPTION = "'apache_md5_crypt()' provides a function compatible with Apache's \
'.htpasswd' files. This was contributed by Bryan Hart <bryan@eai.com>. This \
function is exported by default. \
 \
The 'unix_md5_crypt()' provides a crypt()-compatible interface to the \
rather new MD5-based crypt() function found in modern operating systems. \
It's based on the implementation found on FreeBSD 2.2.[56]-RELEASE. This \
function is also exported by default. \
 \
For both functions, if a salt value is not supplied, a random salt will be \
generated, using the function random_md5_salt(). This function is not \
exported by default."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.42"

RPM_NAME = "perl-Crypt-PasswdMD5-1.42-1.4.noarch.rpm"
RPM_HASH = "d5fb9fe00d841d6c4597cbc45a38c3026813952bc2ea237193de480dd0b90d3cba3c108bc23687d756df2b1ac3bb1d2470fa701194ffdf19b6fc660c1310b45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--PasswdMD5 \
perl-Crypt-PasswdMD5"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest--MD5"

inherit rpm
