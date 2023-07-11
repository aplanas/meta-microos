SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python311-pprintpp-0.4.0-6.4.noarch.rpm"
RPM_HASH = "1f5f52f975bdd162c80b5cb4a5649551da5e6039b795bf4993cf138aac38a3a35e64e6f9206ab2e33f3d5ce23637adb3339a1b5e8ccd3ee3bdf4e9bc2955421f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pprintpp \
python3.11dist-pprintpp \
python311-pprintpp \
python3dist-pprintpp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
