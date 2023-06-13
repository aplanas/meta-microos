SUMMARY = "Lisp dialect that compiles to Lua"
DESCRIPTION = "Fennel is a lisp that compiles to Lua. Features include: \
 \
• Full Lua compatibility - You can use any function or library from \
  Lua. \
• Zero overhead - Compiled code should be just as or more efficient \
  than hand-written Lua. \
• Compile-time macros - Ship compiled code with no runtime \
  dependency on Fennel. \
• Embeddable - Fennel is a one-file library as well as an \
  executable. \
  Embed it in other programs to support runtime extensibility and \
  interactive development."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "lua-fennel-1.2.1-2.1.noarch.rpm"
RPM_HASH = "1cc09407b8be7dde65a9c55668d6f6bf0dd6792058809c1ae964d1c2ce92205e0d8e8d718eb98b5e1b8b988bf276f4051b1baf207c54ac77f1c572382048db49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-fennel"

RDEPENDS:${PN} += "/usr/bin/lua"

inherit rpm
