SUMMARY = "Enlightenment files for upstream branding"
DESCRIPTION = "Various files for Enlightenment provided by upstream but altered by openSUSE or Petite Linux."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-branding-upstream-0.25.4-3.4.aarch64.rpm"
RPM_HASH = "22d10613a3b988baf1eebef7838afee373287ac75b7dab68e7b11e34423f8502959ff522db73ea33c9caa46f200402c9c14d60e6dbf417598de3c46cb27bb164"

RPROVIDES:${PN} += "enlightenment-branding \
enlightenment-branding-upstream"

RDEPENDS:${PN} += "enlightenment-theme-upstream"

inherit rpm
