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

RPM_NAME = "RBTools-1.0.3-1.7.noarch.rpm"
RPM_HASH = "060350bdcbc885ee1659432d5f0db2087c805d9137c313fa90dc86d764a0884bfeab9ccf76ac8d5d3e22fcc2d12c06e339ad07990142f960874cb57c0593f8c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "RBTools \
python3.11dist-rbtools \
python3dist-rbtools"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-colorama \
python3-setuptools \
python3-six \
python3-texttable \
python3-tqdm"

inherit rpm
