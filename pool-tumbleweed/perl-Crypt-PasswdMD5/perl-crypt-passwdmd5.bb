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

RPM_NAME = "perl-Crypt-PasswdMD5-1.42-1.3.noarch.rpm"
RPM_HASH = "d2bf3e5383072fb554007b1201499ff969e1e34aa573d58bcec8e2dece5e2cba28c3caeb2334a0df9025b06be936bc4d23c5a226b797a3f1979c1abd0400fdc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Crypt::PasswdMD5) \
perl-Crypt-PasswdMD5"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Digest::MD5)"

inherit rpm
