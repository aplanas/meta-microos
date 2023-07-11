SUMMARY = "Examples for python311-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-doc-6.5.0-2.2.noarch.rpm"
RPM_HASH = "395ebeda290fa3de1c7e102340dd8907c7230f5f61aac6f5a130db6ff6124420951ac7830c611f34c08a858cc4ee7af08512ca4e4239226297f1adabd724d0a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt6-doc \
python3-qt6-doc \
python311-PyQt6-doc \
python311-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
