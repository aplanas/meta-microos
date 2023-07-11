SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-casttube-0.2.1-2.4.noarch.rpm"
RPM_HASH = "f378dbe65baebdd3b21b7cfe53fcd15ea1d01aa9ab1801ddf093794f97b7654ef841394f8ade4f9166c536673243bc4689b1d13427ea6bcd0a7baf6749197e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-casttube \
python39-casttube \
python3dist-casttube"

RDEPENDS:${PN} += "python-abi"

inherit rpm
