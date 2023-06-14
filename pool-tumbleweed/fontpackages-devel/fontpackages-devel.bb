SUMMARY = "Development Commons for Font Packages"
DESCRIPTION = "Development commons for font packages."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "fontpackages-devel-0.2-12.6.noarch.rpm"
RPM_HASH = "a03693ca3c4812091f9927a51ea57de528169afe9db1c962312f0fd2ec102b4b5b83c2a794d61b4eca8630faa703823752f1744ddfc0aa9dd93492ef81c03873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontpackages-devel \
rpm-macro--fontsconfavaildir \
rpm-macro--fontsconfddir \
rpm-macro--fontsconfdir \
rpm-macro--fontsdir \
rpm-macro--miscfontsdir \
rpm-macro--ttfontsdir \
rpm-macro-files-fontsconf-availdir \
rpm-macro-files-fontsconf-file \
rpm-macro-install-fontsconf \
rpm-macro-link-avail-to-system-fontsconf \
rpm-macro-reconfigure-fonts \
rpm-macro-reconfigure-fonts-cjk \
rpm-macro-reconfigure-fonts-post \
rpm-macro-reconfigure-fonts-posttrans \
rpm-macro-reconfigure-fonts-postun \
rpm-macro-reconfigure-fonts-prereq \
rpm-macro-reconfigure-fonts-scriptlets"

RDEPENDS:${PN} += ""

inherit rpm
