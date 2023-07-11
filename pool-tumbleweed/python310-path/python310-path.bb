SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "16.6.0"

RPM_NAME = "python310-path-16.6.0-2.3.noarch.rpm"
RPM_HASH = "35143510687e88717395fe903c9a863d3dd8e9164ca3c1747c840e3762c26d1c579a84627b536d5b47cc028e822a5bd00280325a718c609134d112a1398ad7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-path \
python310-path \
python310-path.py \
python3dist-path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
