SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "1.18"

RPM_NAME = "python311-funcy-1.18-1.2.noarch.rpm"
RPM_HASH = "14779730049964c5c1cff8099e9106367c92f6cdc7092ff46a0501372b85786b0550fe13dc6fd68cb79eb1e2d5b3a1bc3283d3aa05764d49d064aa7f8a769492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-funcy \
python311-funcy \
python3dist-funcy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
