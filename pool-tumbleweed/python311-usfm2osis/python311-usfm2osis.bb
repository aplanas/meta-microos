SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0+"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python311-usfm2osis-0.6.1+git.1613099315.8fda304-1.4.noarch.rpm"
RPM_HASH = "8139efb4396e9c1445f8f9f9f0571411f29dd498c0bb5407b904beb2eedd04af648e9c450dfa24cdc97c87f2952d0d517d9db151e4ea3cea96a50a1f57695e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-usfm2osis \
python311-usfm2osis \
python3dist-usfm2osis"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
