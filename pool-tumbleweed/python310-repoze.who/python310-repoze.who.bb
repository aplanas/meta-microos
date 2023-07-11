SUMMARY = "Identification and authentication framework for WSGI"
DESCRIPTION = "repoze.who is an identification and authentication framework \
for arbitrary WSGI applications.  repoze.who can be configured \
either as WSGI middleware or as an API for use by an application. \
 \
repoze.who is inspired by Zope 2's Pluggable Authentication \
Service (PAS) (but repoze.who is not dependent on Zope in any \
way; it is useful for any WSGI application).  It provides no facility \
for authorization (ensuring whether a user can or cannot perform the \
operation implied by the request).  This is considered to be the \
domain of the WSGI application."
LICENSE = "SUSE-Repoze"

PV = "2.4.1"

RPM_NAME = "python310-repoze.who-2.4.1-2.3.noarch.rpm"
RPM_HASH = "3ee2de696537b47b07e11e8047021ffc56116832b3b04ee5c3549172df76d5174c613c3c23463f6cd3daa840e6eb7f522f5171cdb09c17705725ad30e7695969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-repoze.who \
python310-repoze.who \
python3dist-repoze.who"

RDEPENDS:${PN} += "python-abi \
python310-WebOb \
python310-zope.interface"

inherit rpm
