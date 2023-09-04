SUMMARY = "OpenLDAP Contrib Modules"
DESCRIPTION = "Various overlays found in contrib/: \
addpartial    Intercepts ADD requests, applies changes to existing entries \
allop \
allowed       Generates attributes indicating access rights \
autogroup \
authzid       implements RFC 3829 support \
cloak \
datamorph     store enumerated values and fixed size integers \
denyop \
lastbind      writes last bind timestamp to entry \
noopsrch      handles no-op search control \
pw-sha2       generates/validates SHA-2 password hashes \
pw-pbkdf2     generates/validates PBKDF2 password hashes \
smbk5pwd      generates Samba3 password hashes (heimdal krb disabled) \
trace         traces overlay invocation \
variant       allows attributes/values to be shared between several entries \
vc            implements the verify credentials extended operation"
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-contrib-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "189471e721892cc1bfbaf3868fd2fee682feb4c24086b4841a508427d8fa025960f34b3d5f12877e949ab70b07bd99f462cf0ef7db001d585fbdf8a19cd2757c"

RPROVIDES:${PN} += "openldap2-contrib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
openldap2"

inherit rpm
