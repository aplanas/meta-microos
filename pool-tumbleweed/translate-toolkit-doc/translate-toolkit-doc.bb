SUMMARY = "Tools and API to assist with translation and software localization -- HTML docs"
DESCRIPTION = "The translate-toolkit-doc package contains Translate Toolkit documentation in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "translate-toolkit-doc-3.8.6-1.4.noarch.rpm"
RPM_HASH = "c22ad6b868d1dc091e31097adcfa4d9de5cfe45e80c516020d430e5c5ba20aa9a52844d94a53574b088a15408ab88dbb2758303a84c1ae7061b353480a78d143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-doc"

RDEPENDS:${PN} += "translate-toolkit"

inherit rpm
