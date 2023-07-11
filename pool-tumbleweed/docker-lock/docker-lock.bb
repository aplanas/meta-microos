SUMMARY = "Automatically manage image digests in Dockerfiles, docker-compose files, and Kubernetes manifests"
DESCRIPTION = "docker-lock is a cli tool that automates managing image digests by tracking them in a separate Lockfile (think package-lock.json or Pipfile.lock). With docker-lock, you can refer to images in Dockerfiles, docker-compose V3 files, and Kubernetes manifests by mutable tags (as in python:3.6) yet receive the same benefits as if you had specified immutable digests (as in python:3.6@sha256:25a189a536ae4d7c77dd5d0929da73057b85555d6b6f8a66bfbcc1a7a7de094b)."
LICENSE = "Apache-2.0"

PV = "0.8.10"

RPM_NAME = "docker-lock-0.8.10-1.10.aarch64.rpm"
RPM_HASH = "c00c36e89c90754802b562bbf2374271bec33f68e54aa782e49d08fedcccf8703c91ff650e94f59a4731fb17a590fd500f6ecbabf2828ec5f8a581759126726d"

RPROVIDES:${PN} += "docker-lock"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
