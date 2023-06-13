SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python39-web.py-0.62-3.8.noarch.rpm"
RPM_HASH = "7144b63cddf5bac6bf25aaf5eabde73463dc93bdb7a0d2d9db11705f20505631ce977d591623f573c84a0e48d2e51de97df695b701568c59c2efe780ea50c7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(web.py) \
python39-web.py \
python3dist(web.py)"

RDEPENDS:${PN} += "python(abi) \
python39-cheroot"

inherit rpm
