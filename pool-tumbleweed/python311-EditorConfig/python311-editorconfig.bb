SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.3+git.1630438300.f43312a"

RPM_NAME = "python311-EditorConfig-0.12.3+git.1630438300.f43312a-1.11.noarch.rpm"
RPM_HASH = "3b35cee70546389669313f230d19c01e4ee0ed2065bb8c75a449a1bed870c44324cf5618837c0472b638f3444327a6852488de0a48e224a5793fb9a37f0b73c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-EditorConfig \
python3.11dist-editorconfig \
python311-EditorConfig \
python3dist-editorconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
