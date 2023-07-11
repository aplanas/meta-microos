SUMMARY = "Read/rewrite/write Python ASTs"
DESCRIPTION = "astor is designed to allow easy manipulation of Python source via the AST. \
There are some other similar libraries, but astor focuses on the following areas: \
- Round-trip an AST back to Python: \
  - Modified AST doesn't need linenumbers, ctx, etc. or otherwise \
    be directly compileable for the round-trip to work. \
  - Easy to read generated code as, well, code \
  - Can round-trip two different source trees to compare for functional \
    differences, using the astor.rtrip tool (for example, after PEP8 edits). \
- Dump pretty-printing of AST \
  - Harder to read than round-tripped code, but more accurate to figure out what \
    is going on. \
  - Easier to read than dump from built-in AST module \
- Non-recursive treewalk \
  - Sometimes you want a recursive treewalk (and astor supports that, starting \
    at any node on the tree), but sometimes you don't need to do that.  astor \
    doesn't require you to explicitly visit sub-nodes unless you want to: \
  - You can add code that executes before a node's children are visited, and/or \
  - You can add code that executes after a node's children are visited, and/or \
  - You can add code that executes and keeps the node's children from being \
    visited (and optionally visit them yourself via a recursive call) \
  - Write functions to access the tree based on object names and/or attribute names \
  - Enjoy easy access to parent node(s) for tree rewriting"
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-astor-0.8.1-9.3.noarch.rpm"
RPM_HASH = "d8832f097a4b499972bd4ea301e274e0e26ca9986c071109422261a5e9a1a300c685329582cff88ea87a21ed04888231a94c7bfd5428290b981b69579d865366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-astor \
python3.11dist-astor \
python311-astor \
python3dist-astor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
