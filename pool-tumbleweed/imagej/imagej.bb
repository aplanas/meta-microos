SUMMARY = "A Java image processing program"
DESCRIPTION = "ImageJ is a multithreaded image processing program inspired by NIH \
Image for the Macintosh, running either as an applet or as a \
standalone program. \
 \
It can read many image formats including TIFF, GIF, JPEG, BMP, DICOM, \
FITS and 'raw', and display, edit, anazlye, process and print \
8/16/32-bit images. It supports 'stacks', a series of images that \
share a single window. It can calculate area and pixel value \
statistics of user-defined selections, measure distances and angles, \
create density histograms and line profile plots, supports standard \
image processing functions such as contrast manipulation, sharpening, \
smoothing, edge detection and median filtering. It does geometric \
transformations such as scaling, rotation and flips. Zoom in/out up \
to 32:1/1:32. Spatial calibration is available to provide real-world \
dimensional measurements in units such as millimeters. Density or \
gray scale calibration is also available. \
 \
ImageJ can be extended via Java plugins, and has a built-in editor and \
compiler."
LICENSE = "SUSE-Public-Domain"

PV = "1.53t"

RPM_NAME = "imagej-1.53t-1.3.noarch.rpm"
RPM_HASH = "065502b5a988c1ddc511610b9b31924ef9784e3d0b38ca78c748e7f913e40340b11214a8eab25a14101344e61709aab5cfa8b7d234451208b94991ad6c942155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imagej"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
