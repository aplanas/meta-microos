SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.3+git.1630438300.f43312a"

RPM_NAME = "python39-EditorConfig-0.12.3+git.1630438300.f43312a-1.11.noarch.rpm"
RPM_HASH = "f890ee3e82c6dbf4dd319c54af9ac4155a5783f36d0ebec8ff0b3fbbf4a67bc9886e5ec8e611072ac66a97c4bdda874f60e28869f921c5c3dae6aa703611b461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-editorconfig \
python39-EditorConfig \
python3dist-editorconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
