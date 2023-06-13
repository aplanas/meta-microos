SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.3+git.1630438300.f43312a"

RPM_NAME = "python311-EditorConfig-0.12.3+git.1630438300.f43312a-1.10.noarch.rpm"
RPM_HASH = "d3b54ea7db93d0f99291a97850cd9b0fe75bfcdee4df5a53e6492ba5a1f3d3dda08802fe369811ddaf5cf92eed11cb9e73f5ada09f16ea575fe62e55f40bc60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(editorconfig) \
python311-EditorConfig \
python3dist(editorconfig)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
