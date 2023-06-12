SUMMARY = "Development Commons for Font Packages"
DESCRIPTION = "Development commons for font packages."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "fontpackages-devel-0.2-12.6.noarch.rpm"
RPM_HASH = "a03693ca3c4812091f9927a51ea57de528169afe9db1c962312f0fd2ec102b4b5b83c2a794d61b4eca8630faa703823752f1744ddfc0aa9dd93492ef81c03873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontpackages-devel \
rpm_macro(_fontsconfavaildir) \
rpm_macro(_fontsconfddir) \
rpm_macro(_fontsconfdir) \
rpm_macro(_fontsdir) \
rpm_macro(_miscfontsdir) \
rpm_macro(_ttfontsdir) \
rpm_macro(files_fontsconf_availdir) \
rpm_macro(files_fontsconf_file) \
rpm_macro(install_fontsconf) \
rpm_macro(link_avail_to_system_fontsconf) \
rpm_macro(reconfigure_fonts) \
rpm_macro(reconfigure_fonts_cjk) \
rpm_macro(reconfigure_fonts_post) \
rpm_macro(reconfigure_fonts_posttrans) \
rpm_macro(reconfigure_fonts_postun) \
rpm_macro(reconfigure_fonts_prereq) \
rpm_macro(reconfigure_fonts_scriptlets)"
RDEPENDS:${PN} += ""

inherit rpm
