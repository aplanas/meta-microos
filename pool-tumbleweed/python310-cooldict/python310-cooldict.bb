SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python310-cooldict-1.04-1.14.noarch.rpm"
RPM_HASH = "773bb286004ed86d203a2f166cd27ed9281b31ec272989ff5936c17b46933f8a2310349b17083a06cec145624a4a60fdc3102832d5876a2fd93a6a02221d8c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cooldict \
python3.10dist(cooldict) \
python310-cooldict \
python3dist(cooldict)"

RDEPENDS:${PN} += "python(abi) \
python310-ana"

inherit rpm
