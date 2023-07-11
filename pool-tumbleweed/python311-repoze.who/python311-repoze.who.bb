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

RPM_NAME = "python311-repoze.who-2.4.1-2.3.noarch.rpm"
RPM_HASH = "0db1b7be01062d61cd210553d1a90b9dae830909e48163913b387262b251eb01ec5d9ec8736b44d54bf20b19529107b45a399d6a0f8fffd09a29b18ffedea89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.who \
python3.11dist-repoze.who \
python311-repoze.who \
python3dist-repoze.who"

RDEPENDS:${PN} += "python-abi \
python311-WebOb \
python311-zope.interface"

inherit rpm
