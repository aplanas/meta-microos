SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) run-time libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This package provides the shared libraries for VTK-m."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libvtk-m-openmpi3-2_0-2.0.0-1.2.aarch64.rpm"
RPM_HASH = "f08d01b841199f544d2b38dd78d7479fe9e574621ef8bdd6201febbbea8b1403012df97ab4af9cdc80294800f91aa1dc68fe9629fb2ffbfe9052a751299b270c"

RPROVIDES:${PN} += "libvtk-m-openmpi3-2-0 \
libvtkm-cont-testing.so.2.0 \
libvtkm-cont.so.2.0 \
libvtkm-filter-clean-grid.so.2.0 \
libvtkm-filter-connected-components.so.2.0 \
libvtkm-filter-contour.so.2.0 \
libvtkm-filter-core.so.2.0 \
libvtkm-filter-density-estimate.so.2.0 \
libvtkm-filter-entity-extraction.so.2.0 \
libvtkm-filter-field-conversion.so.2.0 \
libvtkm-filter-field-transform.so.2.0 \
libvtkm-filter-flow.so.2.0 \
libvtkm-filter-geometry-refinement.so.2.0 \
libvtkm-filter-image-processing.so.2.0 \
libvtkm-filter-mesh-info.so.2.0 \
libvtkm-filter-multi-block.so.2.0 \
libvtkm-filter-resampling.so.2.0 \
libvtkm-filter-scalar-topology.so.2.0 \
libvtkm-filter-vector-analysis.so.2.0 \
libvtkm-filter-zfp.so.2.0 \
libvtkm-io.so.2.0 \
libvtkm-rendering-testing.so.2.0 \
libvtkm-rendering.so.2.0 \
libvtkm-source.so.2.0 \
libvtkm-worklet.so.2.0 \
libvtkmdiympi.so.2.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
openmpi3"

inherit rpm
