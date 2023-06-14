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

RPM_NAME = "python310-astor-0.8.1-9.1.noarch.rpm"
RPM_HASH = "6d53ef58d300c2cb15054d6221c0d165574ae7fb2e16ef26b284fdb3ae25e98a8b9dc657c2c68009f194a5643dd3efce3e15827526e671da520eac2392a0061e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-astor \
python3.10dist-astor \
python310-astor \
python3dist-astor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
