SUMMARY = "Automatically manage image digests in Dockerfiles, docker-compose files, and Kubernetes manifests"
DESCRIPTION = "docker-lock is a cli tool that automates managing image digests by tracking them in a separate Lockfile (think package-lock.json or Pipfile.lock). With docker-lock, you can refer to images in Dockerfiles, docker-compose V3 files, and Kubernetes manifests by mutable tags (as in python:3.6) yet receive the same benefits as if you had specified immutable digests (as in python:3.6@sha256:25a189a536ae4d7c77dd5d0929da73057b85555d6b6f8a66bfbcc1a7a7de094b)."
LICENSE = "Apache-2.0"

PV = "0.8.10"

RPM_NAME = "docker-lock-0.8.10-1.9.aarch64.rpm"
RPM_HASH = "ce082af21385b27118fcf3a850c422564633679de9b577a480778344c2526659f79ecee1cbf51ede421cb0375002ca237286cff8668e82efae23dc1844d25882"

RPROVIDES:${PN} += "docker-lock docker-lock(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
