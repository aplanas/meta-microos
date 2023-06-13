SUMMARY = "Enlightenment files for upstream branding"
DESCRIPTION = "Various files for Enlightenment provided by upstream but altered by openSUSE or Petite Linux."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-branding-upstream-0.25.4-3.3.aarch64.rpm"
RPM_HASH = "029339e1e6c3fe40d3a8ed112a32dd7d3982ba2d55cb7066284e420e4e0c30caae33fff4aece95e27d360d20165c5b7de8927eaedb9de6c11f3c962331b781d2"

RPROVIDES:${PN} += "enlightenment-branding \
enlightenment-branding-upstream \
enlightenment-branding-upstream(aarch-64)"

RDEPENDS:${PN} += "enlightenment-theme-upstream"

inherit rpm
