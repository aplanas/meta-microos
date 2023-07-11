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

RPM_NAME = "python39-repoze.who-2.4.1-2.3.noarch.rpm"
RPM_HASH = "b30066ba9c3d0b681ba3248f39c9db49509912bc56070e5e4fcb9b0674ac31d90c2ef0275cffb97b37346209faf0a44710a22d846fd72544428722341c0615a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-repoze.who \
python39-repoze.who \
python3dist-repoze.who"

RDEPENDS:${PN} += "python-abi \
python39-WebOb \
python39-zope.interface"

inherit rpm
