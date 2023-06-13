SUMMARY = "A collection of various tools using ssh"
DESCRIPTION = "A collection of various tools using ssh \
The following tools are included \
  * ssh-ping: check if host is reachable using ssh_config \
  * ssh-version: shows version of the SSH server you are connecting to \
  * ssh-diff: diff a file over SSH \
  * ssh-facts: get some facts about the remote system \
  * ssh-hostkeys: prints server host keys in several formats \
  * ssh-keyinfo: prints keys in several formats \
  * ssh-certinfo: shows validity and information of SSH certificates"
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "ssh-tools-1.7-1.6.noarch.rpm"
RPM_HASH = "414219a59f96755c0ed76141062900f74b126eaba6dfd95ff4c397f0d3b334878e894d60b491011372cc33f78bc04d220af0d94973507ef657f3681fd22c34a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ssh-tools"

RDEPENDS:${PN} += "/bin/bash \
bash \
openssh"

inherit rpm
