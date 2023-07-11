SUMMARY = "Python ntpsec bindings"
DESCRIPTION = "The ntpsec python bindings used by various ntp utilities."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "python3-ntp-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "7f6fe45611c1039ccc06b6d46c4f58c4dbfd42849f22988dfdf27bf6fdf3266eab32005685217d2108413a4ac1d095b93156c3d21571da8b68895f6e0becfc76"

RPROVIDES:${PN} += "python3-ntp \
python3.11dist-ntpsec \
python3dist-ntpsec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
