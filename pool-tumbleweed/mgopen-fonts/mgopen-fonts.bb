SUMMARY = "Free High-Quality Greek Fonts"
DESCRIPTION = "Free high-quality Greek fonts created by Magenta Ltd."
LICENSE = "SUSE-MgOpen"

PV = "0.20050518"

RPM_NAME = "mgopen-fonts-0.20050518-205.17.noarch.rpm"
RPM_HASH = "0d03d9f5cfd3f02e866aa68634e60b85a3e9aa0d72ee33df1c244d627619c11bc9bbce0c0dd514d45b15a1de96bd435430ae05fe8f8641af1dc8deeb82825f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(el) \
mgopen-fonts \
scalable-font-el"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
