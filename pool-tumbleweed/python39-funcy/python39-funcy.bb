SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "1.18"

RPM_NAME = "python39-funcy-1.18-1.4.noarch.rpm"
RPM_HASH = "4228c4f8939f785d90c04081236c55fe81b0ee29116c717e39c66bf0205fe1b3df5168b85a19af0c46010ce3de1b748279f61e58dfd77f0f5180c49bed26c9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-funcy \
python39-funcy \
python3dist-funcy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
