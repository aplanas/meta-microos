SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.2.1"

RPM_NAME = "python311-jaraco.itertools-6.2.1-2.1.noarch.rpm"
RPM_HASH = "e56464c39011568b50ab48497191e8b4c2b1ee90bec797f6c7cf1a0319d3f0acf6f0a9a7cbeded47076225ae3537ca60cddc29bad7101650a9ef4a89d3dd9e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.itertools) \
python311-jaraco.itertools \
python3dist(jaraco.itertools)"
RDEPENDS:${PN} += "python(abi) \
python311-inflect \
python311-more-itertools"

inherit rpm
