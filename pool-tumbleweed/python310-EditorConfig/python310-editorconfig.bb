SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.3+git.1630438300.f43312a"

RPM_NAME = "python310-EditorConfig-0.12.3+git.1630438300.f43312a-1.11.noarch.rpm"
RPM_HASH = "ba8c99c6a638d6528bd5a80e47e519d523e1ad0cf4de7786fcd2e502efe25d441aaf562229fda0a15400ffb1d9d4a4ba58057c6b4c96775c8dfe6503dc7104ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-editorconfig \
python310-EditorConfig \
python3dist-editorconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
