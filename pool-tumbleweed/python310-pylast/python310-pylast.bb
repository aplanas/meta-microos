SUMMARY = "A python interface to Last.fm"
DESCRIPTION = "A Python interface to Last.fm and other API-compatible websites such as Libre.fm \
 \
Features: \
- Simple public interface. \
- Access to all the data exposed by the Last.fm webservices. \
- Scrobbling support. \
- Full object-oriented design. \
- Proxy support. \
- Internal caching support for some webservices calls (disabled by default). \
- No extra dependencies but python itself. \
- Support for other API-compatible networks like Libre.fm \
- Python3-friendly (Starting from 0.5)."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python310-pylast-4.5.0-3.3.noarch.rpm"
RPM_HASH = "23b6ed1d2deb6b1a1b5e5fc8bc49e9718131c0414ba4654cbb49891d717286d9a33d11f5d6d7542803d8d22b1b2fd8c60053e5c1c7530fe0beadaad895404aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylast \
python3.10dist-pylast \
python310-pylast \
python3dist-pylast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
