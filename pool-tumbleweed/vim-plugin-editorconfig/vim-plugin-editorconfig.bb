SUMMARY = "EditorConfig plugin for Vim"
DESCRIPTION = "EditorConfig helps developers define and maintain consistent coding styles \
between different editors and IDEs. The EditorConfig project consists of a file \
format for defining coding styles and a collection of text editor plugins that \
enable editors to read the file format and adhere to defined styles. \
EditorConfig files are easily readable and they work nicely with version \
control systems. \
 \
This package contains a Vim plugin to support EditorConfig."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "vim-plugin-editorconfig-1.1.1-55.1.noarch.rpm"
RPM_HASH = "e7ed77ca1d5d1d91945b19adf8e7a8421956f6e2b0767fa407a486424ce19672cec6fc3f4e1b58aec0e758a331f37c15737c9f4050199f7484c791c0b6661aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-editorconfig"
RDEPENDS:${PN} += "/bin/sh \
editorconfig"

inherit rpm
