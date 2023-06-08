SUMMARY = "Command line tools for interacting with review board"
DESCRIPTION = "rbtools is a set of client tools to use with Review Board. \
This consists of the following officially supported tools: \
 \
    * post-review \
      - Create and update review requests based on changes in a local tree. \
    * rbt \
      - Execute a number of useful sub-commands to interact with local source \
        code repositories and Review Board. \
    * Python API Client \
      - Python bindings to simplify interaction with the the Review Board \
        Web API. \
 \
There are also some user-contributed scripts and application plugins in the \
contrib directory. See the associated README files for more information."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "RBTools-1.0.3-1.6.noarch.rpm"
RPM_HASH = "c2450e2b16ab733b4dce90a857ec1e96f1e6d37d5ccadc93b0589c4324c9a9dce238861da0d93f5815443317348dee6a16cff72b16c06c187cf748fb25a922a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "RBTools python3.10dist(rbtools) python3dist(rbtools)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-colorama python3-setuptools python3-six python3-texttable python3-tqdm"

inherit rpm
