SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python310-sphinxcontrib-autoprogram-0.1.8-2.3.noarch.rpm"
RPM_HASH = "37376c8df41387ab58bc08c241bc6c345b3fde4865b2b0168c14570d8dbfd76244436084722bcca88610d8090e05226082f8099d89567d3ee961f3c5d673bdb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-autoprogram \
python310-sphinxcontrib-autoprogram \
python3dist-sphinxcontrib-autoprogram"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
