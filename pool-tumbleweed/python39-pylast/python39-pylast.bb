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

RPM_NAME = "python39-pylast-4.5.0-3.3.noarch.rpm"
RPM_HASH = "b313fd78ef3579f5f3ac4146777cdb261be1f34a82db9ed3cfe90385a4cb04f4521dbac581e92bc7730aee973e70b604a96ec025d97d5f90d1f9b3a0e6dced30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylast \
python39-pylast \
python3dist-pylast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
