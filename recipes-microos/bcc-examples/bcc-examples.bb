SUMMARY = "Examples from the BPF Compiler Collection"
DESCRIPTION = "Python and C examples from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-examples-0.26.0-2.8.noarch.rpm"
RPM_HASH = "b425b06d651919948c35b140cff916bd38aa9b3982614b8028e38cab09bbe1599b6d8e63292bc43997daf1fc63c178cccc8122f59f717a55c5bbf80799504c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-examples"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 python3-bcc python3-future"

inherit rpm
