SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-TagStats-0.1.2-4.13.noarch.rpm"
RPM_HASH = "b4f3681d73e0659924c9fe2182806d737bc0888b96abee38aed34ab0919eb74fd68c740bd8397f3d71b9acdf981e906d0841219074661e53d6b3e6545b1f61ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tagstats) \
python39-TagStats \
python3dist(tagstats)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
