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

RPM_NAME = "python310-pylast-4.5.0-3.5.noarch.rpm"
RPM_HASH = "a0e86b292b9e5fe4df5d3267be810ae34fd29d3a41386bbc1014ad1389cd79b6d262f19f24ad073180faa87582701836e8b39fedabecd6f0897aa88456886838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylast \
python310-pylast \
python3dist-pylast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
