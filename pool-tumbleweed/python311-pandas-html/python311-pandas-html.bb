SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-html-2.0.2-4.1.noarch.rpm"
RPM_HASH = "1773ec5078c4c203f2e42226c6e79a519f05dcb2db4ee7234f0401cb3a73cdac19a523a0d4fa380b9e78919c2a62ccaa3070aa57caea7c84e7da086a1a59f088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-html \
python311-pandas-html"

RDEPENDS:${PN} += "python311-beautifulsoup4 \
python311-html5lib \
python311-lxml \
python311-pandas"

inherit rpm
