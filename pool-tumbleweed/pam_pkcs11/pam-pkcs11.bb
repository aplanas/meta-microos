SUMMARY = "PKCS #11 PAM Module"
DESCRIPTION = "This Linux PAM module allows X.509 a certificate-based user \
authentication. The certificate and its dedicated private key are \
thereby accessed by means of an appropriate PKCS #11 module. For the \
verification of the users' certificates, locally stored CA certificates \
as well as online or locally accessible CRLs are used. \
 \
Additionally, the package includes pam_pkcs11-related tools: \
 \
* pkcs11_eventmgr: Generates actions on card insert, removal, or \
  time-out events \
 \
* pklogin_finder: Gets the login name that maps to a certificate \
 \
* pkcs11_inspect: Inspects the contents of a certificate \
 \
* make_hash_links: Creates hash link directories for storing CAs and \
CRLs"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.12"

RPM_NAME = "pam_pkcs11-0.6.12-4.4.aarch64.rpm"
RPM_HASH = "d5f1ca897a9407de53112738c32ebc78664d2a2170cfa5c1390a89dbf04fc113984415851dc10be9ee49890368cd8633b22e47341017dff6f397d578f0537c1f"

RPROVIDES:${PN} += "config-pam-pkcs11 \
pam-pkcs11"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libldap.so.2 \
libnspr4.so \
libnss3.so \
libpam.so.0 \
libpcsclite.so.1 \
libplc4.so \
systemd"

inherit rpm
