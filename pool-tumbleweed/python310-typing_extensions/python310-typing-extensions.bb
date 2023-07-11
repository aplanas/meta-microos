SUMMARY = "Backported and Experimental Type Hints for Python 3.7+"
DESCRIPTION = "The typing_extensions module serves two related purposes: \
 \
  * Enable use of new type system features on older Python versions. \
    For example, typing.TypeGuard is new in Python 3.10, but \
    typing_extensions allows users on previous Python versions to use \
    it too. \
  * Enable experimentation with new type system PEPs before they are \
    accepted and added to the typing module. \
 \
New features may be added to typing_extensions as soon as they are \
specified in a PEP that has been added to the python/peps repository. \
If the PEP is accepted, the feature will then be added to typing for \
the next CPython release. No typing PEP has been rejected so far, so \
we haven't yet figured out how to deal with that possibility. \
 \
Starting with version 4.0.0, typing_extensions uses Semantic Versioning. \
The major version is incremented for all backwards-incompatible changes. \
Therefore, it's safe to depend on typing_extensions like this: \
typing_extensions >=x.y, <(x+1), \
where x.y is the first version that includes all features you need. \
 \
typing_extensions supports Python versions 3.7 and higher. \
In the future, support for older Python versions will be dropped some time \
after that version reaches end of life."
LICENSE = "Python-2.0"

PV = "4.5.0"

RPM_NAME = "python310-typing_extensions-4.5.0-2.3.noarch.rpm"
RPM_HASH = "37bfff758444b28e147c93b89d10ac3751cc08123613c05bd56cdc39b5b65caa62db75d90493e0a420889f5f45b4d2fdeb96f542793f9270a137413b8dd5a71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typing-extensions \
python310-typing-extensions \
python3dist-typing-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
