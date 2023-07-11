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

RPM_NAME = "python39-pylast-4.5.0-3.5.noarch.rpm"
RPM_HASH = "f23af50c59bb8f6055ac6ea0d42ef1cd831affec07bc626b423aa79002c5e535efb184f76a5a5c69a6d988b718e4a45335ba3e9bb2e848f73d6cc968b732b81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylast \
python39-pylast \
python3dist-pylast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
