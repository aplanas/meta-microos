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

RPM_NAME = "vim-plugin-editorconfig-1.1.1-56.1.noarch.rpm"
RPM_HASH = "107c26e2a32d9c4ec11a78098fca28e65b36839f3cd8c0eac2badd4e1330e2dddf3e5c0218c6f2a71c65cc0fce5dd5238f733b132768eb97389fad87bb9a693c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-editorconfig"

RDEPENDS:${PN} += "/usr/bin/sh \
editorconfig"

inherit rpm
