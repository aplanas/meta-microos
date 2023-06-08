SUMMARY = "AirPrint for CUPS printers"
DESCRIPTION = "Tools for setting up AirPrint for CUPS printers on openSUSE. \
 \
AirPrint is an Apple technology that helps you create full-quality printed \
output from iOS or OS X devices without the need to download or install \
drivers. \
 \
Some printers support AirPrint natively; for those you don't need CUPS \
AirPrint support. For any other printer, if it can be printed to via CUPS \
on openSUSE, this package provides the additional tools and configuration \
files needed to add CUPS AirPrint support for basic printing tasks from \
iOS or OS X devices. For limitations see the 'caveats' section in: \
  /usr/share/doc/packages/cups-airprint/README.SUSE \
 \
Some post-install configuration changes have to be performed manually to make \
AirPrint work; please follow the instructions in: \
  /usr/share/doc/packages/cups-airprint/README.SUSE"
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "cups-airprint-1.1-1.9.noarch.rpm"
RPM_HASH = "40e837a8637a72ff3c0c0b9073cecadff5eeacc943a12ff8e38d663e9772472b110eb8b4ef0e848592f3a8ad6c2b8d371b6eccd3a7cf5e22adc510087b9c11b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cups-airprint"
RDEPENDS:${PN} += "/usr/bin/python3 avahi cups cups-filters python3-pycups python3-xml"

inherit rpm
