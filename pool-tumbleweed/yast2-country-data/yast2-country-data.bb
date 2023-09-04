SUMMARY = "YaST2 - Data files for Country settings"
DESCRIPTION = "Data files for yast2-country together with the most often used API \
functions (Language module)"
LICENSE = "GPL-2.0-only"

PV = "4.6.3"

RPM_NAME = "yast2-country-data-4.6.3-1.1.aarch64.rpm"
RPM_HASH = "928a49cc62d2c7a867990b5b3d80deef159fa38628bf471a83c9bfe6754639c7f5c749d999a6fa4a68dd834ae2ef389f77c2336d6678eb2989185d024b58d48b"

RPROVIDES:${PN} += "yast2-country-data"

RDEPENDS:${PN} += "yast2-ruby-bindings"

inherit rpm
