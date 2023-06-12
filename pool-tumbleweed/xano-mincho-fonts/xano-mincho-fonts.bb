SUMMARY = "Japanese 'XANO-Mincho-U32' TrueType font JIS X 0213:2004"
DESCRIPTION = "Japanese 'XANO-Mincho-U32' TrueType font JIS X 0213:2004"
LICENSE = "SUSE-Xano"

PV = "20040509"

RPM_NAME = "xano-mincho-fonts-20040509-11.19.noarch.rpm"
RPM_HASH = "2ee8c957e6376a8e278734c442636e5b11a05ac7a9fd503b625f4c0399711c39e847cecb2530300cd0cecd3cf104739d7dcbb689e561c0b27574c32c8771f9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(ja) \
scalable-font-ja \
xano-mincho \
xano-mincho-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
