SUMMARY = "Python interface for nftables"
DESCRIPTION = "A Python module for nftables."
LICENSE = "GPL-2.0-only"

PV = "1.0.8"

RPM_NAME = "python3-nftables-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "949a65e7665dc91656c06568efdd6454319839b0876091895d80872e6851da92ecf7a9580b9ec43c02de53509bbfe7873451867362c4d540311c14eabe82f657"

RPROVIDES:${PN} += "python3-nftables \
python3.11dist-nftables \
python3dist-nftables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
