SUMMARY = "British ispell dictionary"
DESCRIPTION = "This packages includes a ready British dictionary for ispell. If you \
install ispell-american too, check /etc/sysconfig/ispell to see which \
one will be the default English dictionary. A short usage description \
is given in /usr/share/doc/packages/ispell/README. The sources for this \
dictionary are included in the source package of ispell."
LICENSE = "BSD-3-Clause"

PV = "3.4.05"

RPM_NAME = "ispell-british-3.4.05-1.3.aarch64.rpm"
RPM_HASH = "770c3f6f8a52c36f54703e68a7643df051056239b457dac4b7e6acbffd5613dd0fb153c939a157c6178ab141a03bfccd4b6de7607bbe1387f3c37afaf79f9fd1"

RPROVIDES:${PN} += "ibritish \
ispell-british \
ispell-british(aarch-64) \
ispell_dictionary \
ispell_english_dictionary \
locale(ispell:en_GB)"

RDEPENDS:${PN} += "/bin/sh \
bash \
fileutils"

inherit rpm
